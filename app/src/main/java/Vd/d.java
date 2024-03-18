package Vd;

import Lg.n;
import id.AbstractC3557B;
import io.sentry.AbstractC3670o;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18589a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18590b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f18589a = i10;
        this.f18590b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i10 = this.f18589a;
        Object obj = this.f18590b;
        switch (i10) {
            case 0:
                g gVar = (g) obj;
                AbstractC3557B.c0("this$0", gVar);
                AbstractC3557B.b0("name", str);
                if (!n.Z1(str, gVar.f18597b, false) || n.c2(str, ".tmp", false)) {
                    return false;
                }
                return true;
            default:
                return ((AbstractC3670o) obj).b(str);
        }
    }
}
