package G3;

import android.view.View;
import java.util.ArrayList;
import w.C6059f;

/* renamed from: G3.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0604h extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5922c;

    public C0604h(Object obj, int i10, Object obj2) {
        this.f5920a = i10;
        this.f5922c = obj;
        this.f5921b = obj2;
    }

    @Override // G3.r
    public final void d(s sVar) {
        int i10 = this.f5920a;
        Object obj = this.f5921b;
        switch (i10) {
            case 0:
                E e10 = A.f5879a;
                e10.C((View) obj, 1.0f);
                e10.getClass();
                sVar.w(this);
                return;
            case 1:
                ((ArrayList) ((C6059f) obj).get(((u) this.f5922c).f5968Z)).remove(sVar);
                sVar.w(this);
                return;
            default:
                ((s) obj).z();
                sVar.w(this);
                return;
        }
    }
}
