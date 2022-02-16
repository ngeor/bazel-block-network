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
        "@maven//:junit_junit"
    ],
    tags = [
        "block-network"
    ]
)