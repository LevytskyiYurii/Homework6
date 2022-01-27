class GooSearchResult {
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public String parseDomain() {
        int a =0;
        if (url.contains("http://")) {
            url=url.substring(7, url.length());
        }
        if (url.contains("https://")){
            url=url.substring(8, url.length());
        }
        if (url.contains("/")){
            a = url.indexOf("/");
            url = url.substring(0, a);
        }

        return url;
    }
}
class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}