package U8;

import N0.C1045d;
import id.AbstractC3557B;
import java.util.Map;
import u7.C5848d;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17570Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Map f17571Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Map map, int i10) {
        super(1);
        this.f17570Y = i10;
        this.f17571Z = map;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f17570Y;
        Map map = this.f17571Z;
        switch (i10) {
            case 0:
                C1045d c1045d = (C1045d) obj;
                AbstractC3557B.c0("it", c1045d);
                o.f17542b.getClass();
                o d10 = C5848d.d((String) c1045d.f12508a, map);
                if (d10 instanceof j) {
                    return (j) d10;
                }
                return null;
            default:
                AbstractC3557B.c0("$this$setState", (dc.g) obj);
                return new dc.g(K8.d.p0(map));
        }
    }
}
