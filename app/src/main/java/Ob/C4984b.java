package ob;

import Ng.F;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import kb.C4209C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import za.C6784a;

/* renamed from: ob.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4984b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41206Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f41207Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f41208h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Uri f41209i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Uri f41210j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4984b(l lVar, String str, Uri uri, Uri uri2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41207Z = lVar;
        this.f41208h0 = str;
        this.f41209i0 = uri;
        this.f41210j0 = uri2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4984b(this.f41207Z, this.f41208h0, this.f41209i0, this.f41210j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4984b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41206Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            l lVar = this.f41207Z;
            String str = ((C4209C) lVar.e()).f37232j;
            AbstractC3557B.c0("value", str);
            Uri uri = this.f41209i0;
            String str2 = this.f41208h0;
            Ra.l lVar2 = new Ra.l(str2, 9, new C6784a(str2, str, uri, this.f41210j0));
            this.f41206Y = 1;
            lVar.f41232j.a(lVar2);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
