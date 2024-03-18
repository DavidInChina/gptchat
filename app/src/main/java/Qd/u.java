package Qd;

import com.google.android.gms.internal.play_billing.N;
import com.segment.analytics.kotlin.core.Settings;
import eh.C2917q;
import id.AbstractC3557B;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14660Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f14661Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f14662h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f14663i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(i iVar, String str, String str2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14661Z = iVar;
        this.f14662h0 = str;
        this.f14663i0 = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new u(this.f14661Z, this.f14662h0, this.f14663i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Settings settings;
        String str;
        BufferedReader bufferedReader;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14660Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            i iVar = this.f14661Z;
            r.f.M(iVar, "Fetching settings on " + Thread.currentThread().getName());
            AbstractC3557B.c0("<this>", iVar);
            String str2 = this.f14662h0;
            AbstractC3557B.c0("writeKey", str2);
            String str3 = this.f14663i0;
            AbstractC3557B.c0("cdnHost", str3);
            try {
                InputStream inputStream = new U3.c(str2, iVar.f14610Y.f14634o).C(str3).f14637Z;
                if (inputStream != null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Lg.a.f11131a);
                    if (inputStreamReader instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader, 8192);
                    }
                    str = P4.a.x0(bufferedReader);
                    Ad.l.S(bufferedReader, null);
                } else {
                    str = "";
                }
                r.f.M(iVar, "Fetched Settings: ".concat(str));
                C2917q c2917q = Vd.h.f18604b;
                c2917q.getClass();
                settings = (Settings) c2917q.b(A7.b.U0(Settings.Companion.serializer()), str);
            } catch (Exception e10) {
                AbstractC4344b.W0(iVar, e10);
                AbstractC3557B.s2(i.Companion, e10.getMessage() + ": failed to fetch settings", 1);
                settings = null;
            }
            Ng.B d10 = iVar.f14611Z.d();
            t tVar = new t(iVar, settings, null);
            this.f14660Y = 1;
            if (Ad.l.n1(this, d10, tVar) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
