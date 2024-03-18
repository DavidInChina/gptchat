package a7;

import Z.M;
import Z.N;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.S;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class n extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23927Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f23928Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2084t f23929h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(S s10, AbstractC2084t abstractC2084t, int i10) {
        super(1);
        this.f23927Y = i10;
        this.f23928Z = s10;
        this.f23929h0 = abstractC2084t;
    }

    public final M a(N n10) {
        int i10 = this.f23927Y;
        AbstractC2084t abstractC2084t = this.f23929h0;
        S s10 = this.f23928Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                s10.a(abstractC2084t);
                return new m(s10, abstractC2084t, 0);
            default:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                s10.a(abstractC2084t);
                return new m(s10, abstractC2084t, 1);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23927Y) {
            case 0:
                return a((N) obj);
            default:
                return a((N) obj);
        }
    }
}
