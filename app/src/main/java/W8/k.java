package w8;

import S4.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public final o f48235b;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6140a f48234a = C6143d.f48218Z;

    /* renamed from: c  reason: collision with root package name */
    public final int f48236c = Integer.MAX_VALUE;

    public k(o oVar) {
        this.f48235b = oVar;
    }

    public final List a(CharSequence charSequence) {
        charSequence.getClass();
        o oVar = this.f48235b;
        oVar.getClass();
        i iVar = new i(oVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add((String) iVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
