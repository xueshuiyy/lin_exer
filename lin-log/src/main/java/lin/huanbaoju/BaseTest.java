package lin.huanbaoju;

import lombok.extern.slf4j.Slf4j;

/**
 * 获取token
 */
@Slf4j
class BaseTest {/*

    RestTemplate restTemplate;
    String accessToken = "";
    final String tentNo = "T20180130";
    final String appid = "SA33M3Z345D9AH";
    final String server = "http://192.168.3.35:8000";
    private final String appSecurityKey = "wasn9r84gk7t4budtfkzvxupj6kbkrny";
    
    //楚天生产环境。
//    final String appid = "SA1P6XP8TDZPZC";
//    final String tentNo = "ct1";
//    final String server = "http://10.42.51.83:80";
//    private final String appSecurityKey = "pew4x5c9nuzn50qzj5u6bhmh2wnqwxbu";

    @Before
    public void init() {
        restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory(HttpClientBuilder.create().build()));
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        restTemplate.getInterceptors().add((httpRequest, bytes, clientHttpRequestExecution) -> {
            httpRequest.getHeaders().add("Tenant", tentNo);
            httpRequest.getHeaders().setContentType(MediaType.parseMediaType("application/json;charset=UTF-8"));
            return clientHttpRequestExecution.execute(httpRequest, bytes);
        });
        final String url = server + "/open/thirdpart/api/getAccessToken?appid={appid}&timestamp={timestamp}&nonce={nonce}&signature={signature}";
        final Map<String, String> params = new HashMap<>();
        params.put("appid", appid);
        final long timestamp = new Date().getTime();
        params.put("timestamp", String.valueOf(timestamp));
        final String nonce = "12321";
        params.put("nonce", nonce);
        final String signature = SignatureGenerator.generate(appid, appSecurityKey, nonce, timestamp);
        params.put("signature", signature);
        final AccessTokenDTO dto = restTemplate.getForObject(url, AccessTokenDTO.class, params);
        log.info(JsonUtils.pojoToJson(dto));
        checkRequest(dto, "accessToken查询失败");
        accessToken = dto.getData().getAccess_token();
        log.info("token: " + accessToken);
    }

    void checkRequest(final ResultDTO dto, final String errorMessage) {
        Assert.isTrue(dto.getStatus() == ResultDTO.Status.success, errorMessage);
    }

    void checkList(final Collection<?> data, final String errorMessage) {
        Assert.notEmpty(data, errorMessage);
    }*/

}
