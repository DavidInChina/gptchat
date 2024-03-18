package kf;

import e0.C2743f;
import e0.C2745h;
import e0.C2747j;
import e0.C2749l;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import xf.AbstractC6442e;

/* renamed from: kf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4284i extends AbstractMap implements Map, AbstractC6442e {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C2745h((C2743f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C2747j((C2743f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((C2743f) this).f28696k0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C2749l((C2743f) this);
    }
}
