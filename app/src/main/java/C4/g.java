package C4;

import Rh.AbstractC1337y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g implements f {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2680Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f2681Z;

    public g(List list) {
        this.f2680Y = 0;
        this.f2681Z = list;
    }

    public abstract String a();

    public abstract boolean b();

    public abstract AbstractC1337y0 c();

    @Override // C4.f
    public final boolean r() {
        List list = this.f2681Z;
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() == 1 && ((J4.a) list.get(0)).c()) {
            return true;
        }
        return false;
    }

    @Override // C4.f
    public final List t() {
        return this.f2681Z;
    }

    public final String toString() {
        switch (this.f2680Y) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                List list = this.f2681Z;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public g() {
        this.f2680Y = 1;
        this.f2681Z = new ArrayList();
    }
}
