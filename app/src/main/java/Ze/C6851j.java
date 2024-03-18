package ze;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.List;
import kf.t;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6413b;
import xe.C6417f;
import xe.C6427p;
import xe.C6431t;

/* renamed from: ze.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6851j extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f52010Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6852k f52011Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6851j(AbstractC6852k abstractC6852k, int i10) {
        super(0);
        this.f52010Y = i10;
        this.f52011Z = abstractC6852k;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f52010Y;
        AbstractC6852k abstractC6852k = this.f52011Z;
        switch (i10) {
            case 0:
                AbstractC6432u abstractC6432u = abstractC6852k.f52012a;
                List list = AbstractC6435x.f49956a;
                String e10 = abstractC6432u.e(SIPHeaderNames.CONTENT_DISPOSITION);
                if (e10 == null) {
                    return null;
                }
                int i11 = C6413b.f49879c;
                C6427p c6427p = (C6427p) t.o2(R4.b.N1(e10));
                return new C6413b(c6427p.f49945a, c6427p.f49946b);
            default:
                AbstractC6432u abstractC6432u2 = abstractC6852k.f52012a;
                List list2 = AbstractC6435x.f49956a;
                String e11 = abstractC6432u2.e(SIPHeaderNames.CONTENT_TYPE);
                if (e11 == null) {
                    return null;
                }
                C6417f c6417f = C6417f.f49885e;
                return C6431t.o(e11);
        }
    }
}
