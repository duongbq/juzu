@Modules(value = {
    @Module(@Asset(id = "Foo", value = "foo.js")),
    @Module(@Asset(id = "Bar", value = "bar.js"))
})
@juzu.Application
package plugin.amd.dependencies;
import juzu.plugin.amd.*;
import juzu.plugin.asset.Asset;