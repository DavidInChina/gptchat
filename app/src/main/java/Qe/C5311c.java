package qe;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: qe.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5311c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5312d f44076Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f44077Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44078h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5312d f44079i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f44080j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5311c(C5312d c5312d, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44079i0 = c5312d;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44078h0 = obj;
        this.f44080j0 |= Integer.MIN_VALUE;
        return this.f44079i0.d(null, this);
    }
}
