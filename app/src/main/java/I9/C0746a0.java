package I9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: I9.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0746a0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f8291Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f8292Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M1.v f8293h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0746a0(M1.v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f8293h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f8291Y = obj;
        this.f8292Z |= Integer.MIN_VALUE;
        return this.f8293h0.c(null, this);
    }
}
