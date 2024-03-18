package W4;

import id.AbstractC3557B;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f20728a = new HashMap();

    public final void a(String str, a aVar) {
        this.f20728a.put(str, aVar);
    }

    public final void b(String str, float f6) {
        a aVar = (a) this.f20728a.get(str);
        if (aVar != null) {
            aVar.f20725c = Float.valueOf(f6);
        }
    }

    public final void c(String str, float[] fArr) {
        AbstractC3557B.c0("value", fArr);
        a aVar = (a) this.f20728a.get(str);
        if (aVar != null) {
            aVar.f20725c = fArr;
        }
    }
}
