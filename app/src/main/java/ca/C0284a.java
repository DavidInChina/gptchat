package Ca;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ca.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0284a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2818Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0290g f2819Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f2820h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0284a(C0290g c0290g, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2819Z = c0290g;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2818Y = obj;
        this.f2820h0 |= Integer.MIN_VALUE;
        return this.f2819Z.a(this);
    }
}
