package We;

import java.util.Iterator;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public i f21015Y;

    /* renamed from: Z  reason: collision with root package name */
    public Iterator f21016Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f21017h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ i f21018i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f21019j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f21018i0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f21017h0 = obj;
        this.f21019j0 |= Integer.MIN_VALUE;
        return this.f21018i0.t(this);
    }
}
