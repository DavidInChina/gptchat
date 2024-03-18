package p0;

import java.util.LinkedHashSet;
import z.C6672L;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f41676a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f41677b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f41678c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f41679d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public final C6672L f41680e = new C6672L(14, this);

    public e(H0.r rVar) {
        this.f41676a = rVar;
    }

    public final void a(LinkedHashSet linkedHashSet, Object obj) {
        if (linkedHashSet.add(obj)) {
            if (this.f41679d.size() + this.f41678c.size() + this.f41677b.size() == 1) {
                this.f41676a.invoke(this.f41680e);
            }
        }
    }
}
