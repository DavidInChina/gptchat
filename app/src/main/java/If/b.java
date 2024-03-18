package If;

import Uf.D;
import java.util.LinkedHashSet;
import java.util.List;
import kg.C4290b;
import kg.C4291c;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f8592a;

    /* renamed from: b  reason: collision with root package name */
    public static final C4290b f8593b;

    static {
        List<C4291c> G02 = AbstractC4344b.G0(D.f17726a, D.f17733h, D.f17734i, D.f17728c, D.f17729d, D.f17731f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C4291c c4291c : G02) {
            linkedHashSet.add(C4290b.j(c4291c));
        }
        f8592a = linkedHashSet;
        f8593b = C4290b.j(D.f17732g);
    }
}
