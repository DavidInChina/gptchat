package ta;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: ta.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5714m extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5715n f45971Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f45972Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5715n f45973h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f45974i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5714m(C5715n c5715n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f45973h0 = c5715n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f45972Z = obj;
        this.f45974i0 |= Integer.MIN_VALUE;
        return this.f45973h0.d(null, null, this);
    }
}
