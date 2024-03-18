package lg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: lg.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4464i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f38394b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Map f38395a;

    static {
        new C4464i(0);
    }

    public C4464i() {
        this.f38395a = new HashMap();
    }

    public final void a(C4470o c4470o) {
        this.f38395a.put(new C4463h(c4470o.f38412d.f38405Z, c4470o.f38409a), c4470o);
    }

    public C4464i(int i10) {
        this.f38395a = Collections.emptyMap();
    }
}
