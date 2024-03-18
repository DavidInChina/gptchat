package f7;

import U3.l;
import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: f7.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2943f {

    /* renamed from: a  reason: collision with root package name */
    public final l f29656a;

    /* renamed from: b  reason: collision with root package name */
    public final C2941d f29657b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f29658c = new HashMap();

    public C2943f(Context context, C2941d c2941d) {
        l lVar = new l(13, context);
        this.f29656a = lVar;
        this.f29657b = c2941d;
    }

    public final synchronized h a(String str) {
        if (this.f29658c.containsKey(str)) {
            return (h) this.f29658c.get(str);
        }
        CctBackendFactory l10 = this.f29656a.l(str);
        if (l10 == null) {
            return null;
        }
        C2941d c2941d = this.f29657b;
        h create = l10.create(new C2939b(c2941d.f29649a, c2941d.f29650b, c2941d.f29651c, str));
        this.f29658c.put(str, create);
        return create;
    }
}
