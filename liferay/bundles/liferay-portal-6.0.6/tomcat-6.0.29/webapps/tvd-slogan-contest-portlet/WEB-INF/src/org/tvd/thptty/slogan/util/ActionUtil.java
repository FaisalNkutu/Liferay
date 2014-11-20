package org.tvd.thptty.slogan.util;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import org.tvd.thptty.slogan.model.Slogan;
import org.tvd.thptty.slogan.model.impl.SloganImpl;
import org.tvd.thptty.slogan.service.SloganLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

public class ActionUtil {
    /**
     * Gets slogans out of the service layer.
     *
     * @param request
     * @return List<Slogans>
     */
    @SuppressWarnings("unchecked")
    public static List<Slogan> getSlogans(
        RenderRequest request, int start, int end, OrderByComparator obc) {

        List<Slogan> slogans;

        ThemeDisplay themeDisplay =
            (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        long groupId = themeDisplay.getScopeGroupId();

        try {
            slogans =
                SloganLocalServiceUtil.getSlogans(
                    groupId, WorkflowConstants.STATUS_APPROVED, start,
                    end, obc);
        }
        catch (SystemException e) {
            slogans = Collections.EMPTY_LIST;
        }

        return slogans;
    }

    public static List<Slogan> getSlogans(
        RenderRequest request, int start, int end) {

        List<Slogan> slogans;

        ThemeDisplay themeDisplay =
            (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        long groupId = themeDisplay.getScopeGroupId();

        try {
            slogans =
                SloganLocalServiceUtil.getSlogans(
                    groupId, WorkflowConstants.STATUS_APPROVED, start,
                    end);
        }
        catch (SystemException e) {
            slogans = Collections.emptyList();
        }

        return slogans;
    }

    public static int getSlogansCount(RenderRequest request) {

        ThemeDisplay themeDisplay =
            (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        long groupId = themeDisplay.getScopeGroupId();

        try {
            return SloganLocalServiceUtil.getSlogansCount(
                groupId, WorkflowConstants.STATUS_APPROVED);
        }
        catch (SystemException e) {
            return 0;
        }
    }

    /**
     * Given an ActionRequest, grabs the field values from the form and
     * populates an Slogan object with them. This object can then be validated
     * and then stored.
     *
     * @param request
     * @return
     */
    public static Slogan sloganFromRequest(ActionRequest request) {

        SloganImpl slogan = new SloganImpl();

        ThemeDisplay themeDisplay =
            (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        slogan.setCompanyId(themeDisplay.getCompanyId());
        slogan.setGroupId(themeDisplay.getScopeGroupId());
        slogan.setUserId(themeDisplay.getUserId());
        slogan.setSloganIdString(ParamUtil.getString(
            request, "sloganPrimKey"));
        slogan.setSloganText(ParamUtil.getString(request, "sloganText"));

        if (slogan.getSloganIdString() != "") {
            slogan.setSloganId(Long.parseLong(ParamUtil.getString(
                request, "sloganPrimKey")));
        }

        int sloganDateMonth =
            ParamUtil.getInteger(request, "sloganDateMonth");
        int sloganDateDay =
            ParamUtil.getInteger(request, "sloganDateDay");
        int sloganDateYear =
            ParamUtil.getInteger(request, "sloganDateYear");

        try {
            slogan.setSloganDate(PortalUtil.getDate(
                sloganDateMonth, sloganDateDay, sloganDateYear,
                new PortalException()));
        }
        catch (PortalException ex) {
            slogan.setSloganDate(new Date());
        }

        return slogan;
    }

}
