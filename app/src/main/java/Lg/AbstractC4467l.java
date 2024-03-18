package lg;

import java.util.Map;

/* renamed from: lg.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4467l extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public C4465j f38401Z = C4465j.f38396d;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f38402h0;

    public final void d(AbstractC4468m abstractC4468m) {
        C4444B c4444b;
        if (!this.f38402h0) {
            this.f38401Z = this.f38401Z.clone();
            this.f38402h0 = true;
        }
        C4465j c4465j = this.f38401Z;
        C4465j c4465j2 = abstractC4468m.f38403Y;
        c4465j.getClass();
        int i10 = 0;
        while (true) {
            int size = c4465j2.f38397a.f38339Z.size();
            c4444b = c4465j2.f38397a;
            if (i10 >= size) {
                break;
            }
            c4465j.g((Map.Entry) c4444b.f38339Z.get(i10));
            i10++;
        }
        for (Map.Entry entry : c4444b.h()) {
            c4465j.g(entry);
        }
    }
}
