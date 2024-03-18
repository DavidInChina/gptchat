package x8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class d0 extends W {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f49549a;

    public d0(i0 i0Var) {
        this.f49549a = i0Var;
    }

    @Override // x8.W
    public final Map E() {
        return new TreeMap(this.f49549a);
    }
}
