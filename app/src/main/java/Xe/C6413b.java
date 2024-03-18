package xe;

import id.AbstractC3557B;
import java.util.List;

/* renamed from: xe.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6413b extends AbstractC6429r {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f49879c = 0;

    static {
        new C6413b("file");
        new C6413b("mixed");
        new C6413b("attachment");
        new C6413b("inline");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6413b(String str, List list) {
        super(str, list);
        AbstractC3557B.c0("disposition", str);
        AbstractC3557B.c0("parameters", list);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6413b) {
            C6413b c6413b = (C6413b) obj;
            if (AbstractC3557B.K(this.f49950a, c6413b.f49950a)) {
                if (AbstractC3557B.K(this.f49951b, c6413b.f49951b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49951b.hashCode() + (this.f49950a.hashCode() * 31);
    }

    public /* synthetic */ C6413b(String str) {
        this(str, kf.v.f37483Y);
    }
}
