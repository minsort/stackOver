package app.learn.stackoverflow.model;

import lombok.*;

import java.util.List;

@Data
public class SitesDto {
    private List<SiteDto> items;
}
