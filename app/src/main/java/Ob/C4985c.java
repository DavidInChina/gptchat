package ob;

import Jc.E;
import Lg.n;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ta.V;
import wd.C6174I;
import wd.Z;
import za.C6786c;
import za.C6788e;
import za.C6808y;

/* renamed from: ob.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4985c extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f41211Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f41212Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f41213h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f41214i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4985c(String str, String str2, l lVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f41212Z = str;
        this.f41213h0 = str2;
        this.f41214i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4985c(this.f41212Z, this.f41213h0, this.f41214i0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4985c) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Z z10 = Z.f48378Z;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41211Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Uri parse = Uri.parse(n.v2("file-service://", this.f41212Z));
            AbstractC3557B.b0("parse(...)", parse);
            C6786c c6786c = new C6786c(E.f9042i0, new C6788e(new C6174I(z10, this.f41212Z, null, this.f41213h0, null)));
            C6808y c6808y = this.f41214i0.f41232j;
            V v10 = new V(parse, c6786c, 1);
            this.f41211Y = 1;
            c6808y.a(v10);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
