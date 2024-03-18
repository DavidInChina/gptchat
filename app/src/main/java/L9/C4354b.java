package l9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: l9.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4354b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public String f37887Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37888Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4355c f37889h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37890i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4354b(C4355c c4355c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37889h0 = c4355c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37888Z = obj;
        this.f37890i0 |= Integer.MIN_VALUE;
        return this.f37889h0.b(this);
    }
}
