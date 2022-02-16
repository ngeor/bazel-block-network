java_library(
    name = "hello",
    srcs = glob(["src/main/java/**/*.java"])
)

java_test(
    name = "hello_test",
    srcs = glob(["src/test/java/**/*.java"]),
    test_class = "foo.HelloTest",
    deps = [
        ":hello",
        "@maven//:junit_junit",
        "@maven//:io_dropwizard_dropwizard_core",
        "@maven//:io_dropwizard_dropwizard_testing",
        "@maven//:jakarta_ws_rs_jakarta_ws_rs_api"
    ],
    tags = [
        "block-network"
    ]
)
