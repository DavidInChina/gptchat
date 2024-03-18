package Pd;

import Vd.i;
import W8.d;
import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a implements i, d {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f13945a;

    public /* synthetic */ a(SharedPreferences sharedPreferences) {
        this.f13945a = sharedPreferences;
    }

    @Override // Vd.i
    public boolean a(int i10, String str) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return this.f13945a.edit().putInt(str, i10).commit();
    }

    @Override // Vd.i
    public int b(String str) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return this.f13945a.getInt(str, 0);
    }
}
