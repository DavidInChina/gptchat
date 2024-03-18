package qe;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: qe.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5309a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5312d f44067Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44068Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5312d f44069h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44070i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5309a(C5312d c5312d, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44069h0 = c5312d;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44068Z = obj;
        this.f44070i0 |= Integer.MIN_VALUE;
        return this.f44069h0.b(this);
    }
}
