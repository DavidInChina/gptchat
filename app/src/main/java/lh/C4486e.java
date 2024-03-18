package lh;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lh.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4486e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4488g f38465Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f38466Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4488g f38467h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f38468i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4486e(C4488g c4488g, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38467h0 = c4488g;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38466Z = obj;
        this.f38468i0 |= Integer.MIN_VALUE;
        return this.f38467h0.c(null, this);
    }
}
