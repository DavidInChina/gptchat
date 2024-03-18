package q1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import p1.m;
import t1.AbstractC5658d;

/* renamed from: q1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5257c {

    /* renamed from: a  reason: collision with root package name */
    public Context f43641a;

    /* renamed from: b  reason: collision with root package name */
    public String f43642b;

    /* renamed from: c  reason: collision with root package name */
    public Intent[] f43643c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f43644d;

    /* renamed from: e  reason: collision with root package name */
    public IconCompat f43645e;

    /* renamed from: f  reason: collision with root package name */
    public HashSet f43646f;

    /* renamed from: g  reason: collision with root package name */
    public m f43647g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f43648h;

    /* renamed from: i  reason: collision with root package name */
    public PersistableBundle f43649i;

    public final ShortcutInfo a() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        G1.a.i();
        shortLabel = G1.a.b(this.f43641a, this.f43642b).setShortLabel(this.f43644d);
        intents = shortLabel.setIntents(this.f43643c);
        IconCompat iconCompat = this.f43645e;
        if (iconCompat != null) {
            intents.setIcon(AbstractC5658d.c(iconCompat, this.f43641a));
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        HashSet hashSet = this.f43646f;
        if (hashSet != null) {
            intents.setCategories(hashSet);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = this.f43649i;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            m mVar = this.f43647g;
            if (mVar != null) {
                intents.setLocusId(mVar.f41733b);
            }
            intents.setLongLived(this.f43648h);
        } else {
            if (this.f43649i == null) {
                this.f43649i = new PersistableBundle();
            }
            m mVar2 = this.f43647g;
            if (mVar2 != null) {
                this.f43649i.putString("extraLocusId", mVar2.f41732a);
            }
            this.f43649i.putBoolean("extraLongLived", this.f43648h);
            intents.setExtras(this.f43649i);
        }
        if (i10 >= 33) {
            AbstractC5256b.a(intents);
        }
        build = intents.build();
        return build;
    }
}
