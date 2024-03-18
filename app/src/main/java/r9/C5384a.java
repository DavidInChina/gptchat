package r9;

import G0.X;
import I9.J0;
import W.I2;
import W.M3;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import jf.AbstractC3953c;
import jf.C3959i;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4829i;
import nf.AbstractC4831k;
import q9.AbstractC5285b;
import qa.C5294d;

/* renamed from: r9.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5384a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44516Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f44517Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f44518h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5384a(Object obj, boolean z10, int i10) {
        super(2);
        this.f44516Y = i10;
        this.f44518h0 = obj;
        this.f44517Z = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3959i a(int i10, CharSequence charSequence) {
        C3959i c3959i;
        Object obj;
        Object obj2;
        int i11 = this.f44516Y;
        Object obj3 = this.f44518h0;
        switch (i11) {
            case 4:
                AbstractC3557B.c0("$this$$receiver", charSequence);
                int m22 = Lg.n.m2(i10, charSequence, this.f44517Z, (char[]) obj3);
                if (m22 < 0) {
                    return null;
                }
                return new C3959i(Integer.valueOf(m22), 1);
            default:
                AbstractC3557B.c0("$this$$receiver", charSequence);
                List list = (List) obj3;
                boolean z10 = this.f44517Z;
                if (!z10 && list.size() == 1) {
                    String str = (String) kf.t.A2(list);
                    int l22 = Lg.n.l2(charSequence, str, i10, false, 4);
                    if (l22 >= 0) {
                        c3959i = new C3959i(Integer.valueOf(l22), str);
                        if (c3959i == null) {
                        }
                    }
                    c3959i = null;
                    if (c3959i == null) {
                    }
                } else {
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    Cf.e eVar = new Cf.e(i10, charSequence.length(), 1);
                    boolean z11 = charSequence instanceof String;
                    int i12 = eVar.f3108h0;
                    int i13 = eVar.f3107Z;
                    if (z11) {
                        if ((i12 > 0 && i10 <= i13) || (i12 < 0 && i13 <= i10)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        String str2 = (String) obj2;
                                        if (Lg.n.t2(0, i10, str2.length(), str2, (String) charSequence, z10)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                String str3 = (String) obj2;
                                if (str3 != null) {
                                    c3959i = new C3959i(Integer.valueOf(i10), str3);
                                } else if (i10 != i13) {
                                    i10 += i12;
                                }
                            }
                            if (c3959i == null) {
                                return null;
                            }
                            return new C3959i(c3959i.f36155Y, Integer.valueOf(((String) c3959i.f36156Z).length()));
                        }
                        c3959i = null;
                        if (c3959i == null) {
                        }
                    } else {
                        if ((i12 > 0 && i10 <= i13) || (i12 < 0 && i13 <= i10)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        String str4 = (String) obj;
                                        if (Lg.n.u2(str4, 0, charSequence, i10, str4.length(), z10)) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                String str5 = (String) obj;
                                if (str5 != null) {
                                    c3959i = new C3959i(Integer.valueOf(i10), str5);
                                } else if (i10 != i13) {
                                    i10 += i12;
                                }
                            }
                        }
                        c3959i = null;
                        if (c3959i == null) {
                        }
                    }
                }
                break;
        }
    }

    public final void c(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f44516Y;
        boolean z10 = this.f44517Z;
        Object obj = this.f44518h0;
        switch (i11) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                if (z10) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    rVar2.W(-1647648504);
                    I2.b(androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b), 0L, 0.0f, 0L, 0, rVar2, 6, 30);
                    rVar2.t(false);
                    return;
                }
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-1647648387);
                ((wf.n) obj).invoke(rVar3, 0);
                rVar3.t(false);
                return;
            case 1:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                String str = ((J0) obj).f8187a.f26379f;
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(-486378790);
                if (str == null) {
                    str = Ng.H.v(R.string.conversations_default_title, rVar5);
                }
                rVar5.t(false);
                AbstractC5285b.a(str, false, R4.b.X(rVar5, -97467859, new C5389f(str, z10, 3)), rVar5, 432);
                return;
            case 2:
                AbstractC4326r a5 = io.sentry.compose.b.a("DisclosureContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                String str2 = ((C5294d) obj).f44022a;
                N0.E e10 = ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20301b;
                j4.b(str2, AbstractC4194d.a((X) a5, Bi.c.I1(c4323o, z10, false)), 0L, 0L, null, S0.D.f15972k0, null, 0L, null, null, 0L, 0, false, 0, 0, null, e10, abstractC1725n, 196608, 0, 65500);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("VoiceTrainingSwitch");
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                M3.a(this.f44517Z, (wf.k) obj, a10, null, false, null, null, abstractC1725n, 0, 124);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44516Y) {
            case 0:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                return a(((Number) obj2).intValue(), (CharSequence) obj);
            case 5:
                return a(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((AbstractC4831k) obj).plus((AbstractC4829i) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5384a(boolean z10, AbstractC3953c abstractC3953c, int i10) {
        super(2);
        this.f44516Y = i10;
        this.f44517Z = z10;
        this.f44518h0 = abstractC3953c;
    }
}
