package id;

import H0.Z;
import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.o1;
import android.content.Context;
import com.openai.chatgpt.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import l0.AbstractC4326r;
import nf.AbstractC4828h;
import y.AbstractC6463a;

/* renamed from: id.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3569i extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3569i f33097Z = new C3569i(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3569i f33098h0 = new C3569i(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33099Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3569i(int i10) {
        super(2);
        this.f33099Y = i10;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        BufferedReader bufferedReader;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        o1 o1Var = o1.f22665a;
        switch (this.f33099Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.created_by_chatgpt, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.info, abstractC1725n), H.v(R.string.column_info, abstractC1725n), a10, 0L, abstractC1725n, 8, 12);
                return;
            case 2:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Z.r rVar4 = (Z.r) abstractC1725n;
                InputStream openRawResource = ((Context) rVar4.m(Z.f6888b)).getResources().openRawResource(R.raw.car_preview_data);
                AbstractC3557B.b0("openRawResource(...)", openRawResource);
                InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, Lg.a.f11131a);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                try {
                    x xVar = (x) md.b.f39132a.b(x.Companion.serializer(), P4.a.x0(bufferedReader));
                    Ad.l.S(bufferedReader, null);
                    rVar4.W(1165504115);
                    Object K10 = rVar4.K();
                    if (K10 == iVar) {
                        K10 = AbstractC4828h.Z(new C3556A(), o1Var);
                        rVar4.h0(K10);
                    }
                    AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
                    rVar4.t(false);
                    C3556A c3556a = (C3556A) abstractC1710f0.getValue();
                    rVar4.W(1165504236);
                    Object K11 = rVar4.K();
                    if (K11 == iVar) {
                        K11 = AbstractC6463a.h(abstractC1710f0, 17, rVar4);
                    }
                    rVar4.t(false);
                    Bi.c.x(xVar, c3556a, (wf.k) K11, rVar4, 384);
                    return;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        Ad.l.S(bufferedReader, th2);
                        throw th3;
                    }
                }
            default:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                Z.r rVar6 = (Z.r) abstractC1725n;
                U3.l G10 = P4.a.G();
                InputStream openRawResource2 = ((Context) rVar6.m(Z.f6888b)).getResources().openRawResource(R.raw.car_preview_data_csv);
                AbstractC3557B.b0("openRawResource(...)", openRawResource2);
                C3571k c3571k = C3571k.f33102Z;
                Charset charset = (Charset) G10.f17424h0;
                AbstractC3557B.b0("charsetCode", charset);
                V6.c C10 = M3.H.C(openRawResource2, charset);
                P5.c cVar = (P5.c) G10.f17423Z;
                cVar.getClass();
                V6.b bVar = new V6.b(cVar, C10);
                V6.a aVar = bVar.f18407b;
                try {
                    Object invoke = c3571k.invoke(bVar);
                    aVar.f18405a.f18410a.close();
                    x xVar2 = (x) invoke;
                    rVar6.W(659946106);
                    Object K12 = rVar6.K();
                    if (K12 == iVar) {
                        K12 = AbstractC4828h.Z(new C3556A(), o1Var);
                        rVar6.h0(K12);
                    }
                    AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K12;
                    rVar6.t(false);
                    C3556A c3556a2 = (C3556A) abstractC1710f02.getValue();
                    rVar6.W(659946227);
                    Object K13 = rVar6.K();
                    if (K13 == iVar) {
                        K13 = AbstractC6463a.h(abstractC1710f02, 18, rVar6);
                    }
                    rVar6.t(false);
                    Bi.c.x(xVar2, c3556a2, (wf.k) K13, rVar6, 384);
                    return;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        try {
                            aVar.f18405a.f18410a.close();
                        } catch (Throwable th6) {
                            P4.a.m(th4, th6);
                        }
                        throw th5;
                    }
                }
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f33099Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
