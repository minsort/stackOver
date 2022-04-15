package app.learn.stackoverflow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SiteDto {
    private String favicon_url;
    private String audience;
    private String site_url;
    private String name;
}
