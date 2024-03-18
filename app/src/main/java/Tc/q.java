package Tc;

import H0.W0;
import android.content.Context;
import android.content.Intent;
import id.AbstractC3557B;
import m.AbstractActivityC4532l;

/* loaded from: classes2.dex */
public final class q implements W0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17117a;

    /* renamed from: b  reason: collision with root package name */
    public final f f17118b;

    public q(AbstractActivityC4532l abstractActivityC4532l, f fVar) {
        AbstractC3557B.c0("context", abstractActivityC4532l);
        AbstractC3557B.c0("appState", fVar);
        this.f17117a = abstractActivityC4532l;
        this.f17118b = fVar;
    }

    @Override // H0.W0
    public final void a(String str) {
        AbstractC3557B.c0("uri", str);
        Intent intent = new Intent();
        A7.b.G0(intent, str);
        K8.d.O0(this.f17117a, this.f17118b, intent);
    }
}
