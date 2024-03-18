package s3;

import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;

/* renamed from: s3.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5572w extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45372Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Bundle f45373Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5572w(int i10, Bundle bundle) {
        super(1);
        this.f45372Y = i10;
        this.f45373Z = bundle;
    }

    public final Boolean a(String str) {
        int i10 = this.f45372Y;
        Bundle bundle = this.f45373Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("argName", str);
                return Boolean.valueOf(!bundle.containsKey(str));
            default:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                return Boolean.valueOf(!bundle.containsKey(str));
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f45372Y) {
            case 0:
                return a((String) obj);
            default:
                return a((String) obj);
        }
    }
}
