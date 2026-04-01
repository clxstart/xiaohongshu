1. 用户让我干什么就直接干什么。
2. 回答必须精简。
3. 以后用户让我改时，不要解释，直接改。

# MyBatis 整合开发流程

## 分包结构

```
src/main/java/com/clx/xiaochangshu/auth/
├── domain/
│   ├── dataobject/    # DO 类（数据库表映射）
│   └── mapper/        # Mapper 接口

src/main/resources/
├── config/
│   ├── application.yml        # 主配置
│   ├── application-dev.yml    # 开发环境
│   └── application-prod.yml   # 生产环境
└── mapper/
    └── UserDOMapper.xml       # MyBatis XML
```

## 关键配置

- 父工程 pom.xml 声明 MyBatis 和 MySQL 驱动版本
- 子模块 pom.xml 引入依赖
- 启动类添加 `@MapperScan("com.clx.xiaochangshu.auth.domain.mapper")`
- application.yml 配置 `mapper-locations: classpath:/mapper/**/*.xml`
- application-dev.yml 配置数据源连接和 mapper 包日志级别为 debug
