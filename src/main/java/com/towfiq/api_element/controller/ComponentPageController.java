package com.towfiq.api_element.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author TOWFIQUL ISLAM
 * @since 11/07/2021 22:05
 */
@Controller
@RequestMapping("/components")
public class ComponentPageController {

    private static final String BASE_DIR = "components/";

    @GetMapping("/overview")
    public String getOverview() {
        return BASE_DIR + "overview";
    }

    @GetMapping("/button")
    public String getButton() {
        return BASE_DIR + "button";
    }

    @GetMapping("/icon")
    public String getIcon() {
        return BASE_DIR + "icon";
    }

    @GetMapping("/typography")
    public String getTypography() {
        return BASE_DIR + "typography";
    }

    @GetMapping("/divider")
    public String getDivider() {
        return BASE_DIR + "divider";
    }

    @GetMapping("/grid")
    public String getGrid() {
        return BASE_DIR + "grid";
    }

    @GetMapping("/layout")
    public String getLayout() {
        return BASE_DIR + "layout";
    }

    @GetMapping("/space")
    public String getSpace() {
        return BASE_DIR + "space";
    }

    @GetMapping("/affix")
    public String getAffix() {
        return BASE_DIR + "affix";
    }

    @GetMapping("/breadcrumb")
    public String getBreadcrumb() {
        return BASE_DIR + "breadcrumb";
    }

    @GetMapping("/dropdown")
    public String getDropdown() {
        return BASE_DIR + "dropdown";
    }

    @GetMapping("/menu")
    public String getMenu() {
        return BASE_DIR + "menu";
    }

    @GetMapping("/page-header")
    public String getPageHeader() {
        return BASE_DIR + "page-header";
    }

    @GetMapping("/pagination")
    public String getPagination() {
        return BASE_DIR + "pagination";
    }

    @GetMapping("/steps")
    public String getSteps() {
        return BASE_DIR + "steps";
    }

    @GetMapping("/auto-complete")
    public String getAutoComplete() {
        return BASE_DIR + "auto-complete";
    }

    @GetMapping("/cascader")
    public String getCascader() {
        return BASE_DIR + "cascader";
    }

    @GetMapping("/checkbox")
    public String getCheckbox() {
        return BASE_DIR + "checkbox";
    }

    @GetMapping("/date-picker")
    public String getDatePicker() {
        return BASE_DIR + "date-picker";
    }

    @GetMapping("/form")
    public String getForm() {
        return BASE_DIR + "form";
    }

    @GetMapping("/input")
    public String getInput() {
        return BASE_DIR + "input";
    }

    @GetMapping("/input-number")
    public String getInputNumber() {
        return BASE_DIR + "input-number";
    }

    @GetMapping("/mentions")
    public String getMentions() {
        return BASE_DIR + "mentions";
    }

    @GetMapping("/radio")
    public String getRadio() {
        return BASE_DIR + "radio";
    }

    @GetMapping("/rate")
    public String getRate() {
        return BASE_DIR + "rate";
    }

    @GetMapping("/select")
    public String getSelect() {
        return BASE_DIR + "select";
    }

    @GetMapping("/slider")
    public String getSlider() {
        return BASE_DIR + "slider";
    }

    @GetMapping("/switch")
    public String getSwitch() {
        return BASE_DIR + "switch";
    }

    @GetMapping("/time-picker")
    public String getTimePicker() {
        return BASE_DIR + "time-picker";
    }

    @GetMapping("/transfer")
    public String getTransfer() {
        return BASE_DIR + "transfer";
    }

    @GetMapping("/tree-select")
    public String getTreeSelect() {
        return BASE_DIR + "tree-select";
    }

    @GetMapping("/upload")
    public String getUpload() {
        return BASE_DIR + "upload";
    }

    @GetMapping("/avatar")
    public String getAvatar() {
        return BASE_DIR + "avatar";
    }

    @GetMapping("/badge")
    public String getBadge() {
        return BASE_DIR + "badge";
    }

    @GetMapping("/calendar")
    public String getCalendar() {
        return BASE_DIR + "calendar";
    }

    @GetMapping("/card")
    public String getCard() {
        return BASE_DIR + "card";
    }

    @GetMapping("/carousel")
    public String getCarousel() {
        return BASE_DIR + "carousel";
    }

    @GetMapping("/collapse")
    public String getCollapse() {
        return BASE_DIR + "collapse";
    }

    @GetMapping("/comment")
    public String getComment() {
        return BASE_DIR + "comment";
    }

    @GetMapping("/descriptions")
    public String getDescriptions() {
        return BASE_DIR + "descriptions";
    }

    @GetMapping("/empty")
    public String getEmpty() {
        return BASE_DIR + "empty";
    }

    @GetMapping("/image")
    public String getImage() {
        return BASE_DIR + "image";
    }

    @GetMapping("/list")
    public String getList() {
        return BASE_DIR + "list";
    }

    @GetMapping("/popover")
    public String getPopover() {
        return BASE_DIR + "popover";
    }

    @GetMapping("/statistic")
    public String getStatistic() {
        return BASE_DIR + "statistic";
    }

    @GetMapping("/table")
    public String getTable() {
        return BASE_DIR + "table";
    }

    @GetMapping("/tabs")
    public String getTabs() {
        return BASE_DIR + "tabs";
    }

    @GetMapping("/tag")
    public String getTag() {
        return BASE_DIR + "tag";
    }

    @GetMapping("/timeline")
    public String getTimeline() {
        return BASE_DIR + "timeline";
    }

    @GetMapping("/tooltip")
    public String getTooltip() {
        return BASE_DIR + "tooltip";
    }

    @GetMapping("/tree")
    public String getTree() {
        return BASE_DIR + "tree";
    }

    @GetMapping("/alert")
    public String getAlert() {
        return BASE_DIR + "alert";
    }

    @GetMapping("/drawer")
    public String getDrawer() {
        return BASE_DIR + "drawer";
    }

    @GetMapping("/message")
    public String getMessage() {
        return BASE_DIR + "message";
    }

    @GetMapping("/modal")
    public String getModal() {
        return BASE_DIR + "modal";
    }

    @GetMapping("/notification")
    public String getNotification() {
        return BASE_DIR + "notification";
    }

    @GetMapping("/popconfirm")
    public String getPopConfirm() {
        return BASE_DIR + "popconfirm";
    }

    @GetMapping("/progress")
    public String getProgress() {
        return BASE_DIR + "progress";
    }

    @GetMapping("/result")
    public String getResult() {
        return BASE_DIR + "result";
    }

    @GetMapping("/skeleton")
    public String getSkeleton() {
        return BASE_DIR + "skeleton";
    }

    @GetMapping("/spin")
    public String getSpin() {
        return BASE_DIR + "spin";
    }

    @GetMapping("/anchor")
    public String getAnchor() {
        return BASE_DIR + "anchor";
    }

    @GetMapping("/back-top")
    public String getBackTop() {
        return BASE_DIR + "back-top";
    }

    @GetMapping("/config-provider")
    public String getConfigProvider() {
        return BASE_DIR + "config-provider";
    }

}
