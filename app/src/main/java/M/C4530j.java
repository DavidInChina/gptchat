package m;

import android.os.Bundle;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: m.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4530j implements A3.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38774a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38775b;

    public C4530j(A3.d dVar) {
        this.f38774a = 1;
        AbstractC3557B.c0("registry", dVar);
        this.f38775b = new LinkedHashSet();
        dVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // A3.c
    public final Bundle a() {
        int i10 = this.f38774a;
        Object obj = this.f38775b;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC4532l) obj).n().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public C4530j(AbstractActivityC4532l abstractActivityC4532l) {
        this.f38774a = 0;
        this.f38775b = abstractActivityC4532l;
    }
}
