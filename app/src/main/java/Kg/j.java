package Kg;

import id.AbstractC3557B;
import java.util.Iterator;
import jf.AbstractC3953c;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9835a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3953c f9836b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9837c;

    public j(k kVar, androidx.compose.foundation.layout.c cVar) {
        this.f9837c = kVar;
        this.f9836b = cVar;
    }

    @Override // Kg.k
    public final Iterator iterator() {
        switch (this.f9835a) {
            case 0:
                return new i(this, 0);
            case 1:
                return new e(this);
            default:
                return new i(this);
        }
    }

    public j(k kVar, wf.k kVar2) {
        AbstractC3557B.c0("sequence", kVar);
        this.f9837c = kVar;
        this.f9836b = kVar2;
    }

    public j(AbstractC6216a abstractC6216a, wf.k kVar) {
        this.f9837c = abstractC6216a;
        this.f9836b = kVar;
    }
}
