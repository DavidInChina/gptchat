package ta;

import android.net.Uri;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;
import za.AbstractC6806w;
import za.C6804u;
import za.C6805v;
import za.C6807x;

/* renamed from: ta.M  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5697M extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45833Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6806w f45834Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5697M(AbstractC6806w abstractC6806w, int i10) {
        super(1);
        this.f45833Y = i10;
        this.f45834Z = abstractC6806w;
    }

    public final C6807x a(C6807x c6807x) {
        int i10 = this.f45833Y;
        AbstractC6806w abstractC6806w = this.f45834Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$update", c6807x);
                return C6807x.a(c6807x, ((C6805v) abstractC6806w).f51803a, null, null, false, null, 30);
            default:
                AbstractC3557B.c0("$this$update", c6807x);
                Uri uri = ((C6804u) abstractC6806w).f51802a;
                Map map = c6807x.f51805b;
                AbstractC3557B.c0("<this>", map);
                LinkedHashMap m12 = AbstractC4268D.m1(map);
                m12.remove(uri);
                return C6807x.a(c6807x, null, AbstractC4268D.d1(m12), null, false, null, 29);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f45833Y) {
            case 0:
                return a((C6807x) obj);
            default:
                return a((C6807x) obj);
        }
    }
}
