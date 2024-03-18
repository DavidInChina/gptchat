package qe;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.u;
import java.nio.charset.Charset;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: qe.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5317i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Charset f44098Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44099Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ u f44100h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Charset f44101i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ StringBuilder f44102j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5317i(u uVar, Charset charset, StringBuilder sb2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44100h0 = uVar;
        this.f44101i0 = charset;
        this.f44102j0 = sb2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5317i(this.f44100h0, this.f44101i0, this.f44102j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5317i) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        Charset charset;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44099Z;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    charset = this.f44098Y;
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                u uVar = this.f44100h0;
                Charset charset2 = this.f44101i0;
                this.f44098Y = charset2;
                this.f44099Z = 1;
                obj = AbstractC3557B.o2(uVar, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                charset = charset2;
            }
            str = N.q0((Me.h) obj, charset);
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "[request body omitted]";
        }
        StringBuilder sb2 = this.f44102j0;
        sb2.append("BODY START");
        sb2.append('\n');
        sb2.append(str);
        sb2.append('\n');
        sb2.append("BODY END");
        return y.f36177a;
    }
}
