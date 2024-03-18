package n9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: n9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4724c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4726e f39663Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39664Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4726e f39665h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f39666i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4724c(C4726e c4726e, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39665h0 = c4726e;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39664Z = obj;
        this.f39666i0 |= Integer.MIN_VALUE;
        return this.f39665h0.e(this);
    }
}
