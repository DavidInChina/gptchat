package dh;

import java.lang.ref.SoftReference;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public volatile SoftReference f28432a;

    public final synchronized Object a(AbstractC6216a abstractC6216a) {
        Object obj = this.f28432a.get();
        if (obj != null) {
            return obj;
        }
        Object mo122invoke = abstractC6216a.mo122invoke();
        this.f28432a = new SoftReference(mo122invoke);
        return mo122invoke;
    }
}
