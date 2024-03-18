package m0;

import android.view.View;
import android.view.autofill.AutofillManager;

/* renamed from: m0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4543a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final View f38799a;

    /* renamed from: b  reason: collision with root package name */
    public final i f38800b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f38801c;

    public C4543a(View view, i iVar) {
        this.f38799a = view;
        this.f38800b = iVar;
        AutofillManager j6 = Wd.j.j(view.getContext().getSystemService(Wd.j.m()));
        if (j6 != null) {
            this.f38801c = j6;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
