package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.subscriberattributes.SpecialSubscriberAttributesKt;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import id.AbstractC3557B;
import java.util.Date;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import r9.y;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB\u000f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eB5\u0012\u0006\u0010\u0002\u001a\u00020\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J=\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u000f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010%J\u0006\u0010&\u001a\u00020\rJ\b\u0010'\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006("}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "value", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "setTime", "Ljava/util/Date;", "isSynced", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;Z)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;Z)V", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "()Z", "getKey", "()Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "getSetTime", "()Ljava/util/Date;", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toBackendMap", "", "toJSONObject", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class SubscriberAttribute {
    private final DateProvider dateProvider;
    private final boolean isSynced;
    private final SubscriberAttributeKey key;
    private final Date setTime;
    private final String value;

    public SubscriberAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, subscriberAttributeKey);
        AbstractC3557B.c0("dateProvider", dateProvider);
        AbstractC3557B.c0("setTime", date);
        this.key = subscriberAttributeKey;
        this.value = str;
        this.dateProvider = dateProvider;
        this.setTime = date;
        this.isSynced = z10;
    }

    public static /* synthetic */ SubscriberAttribute copy$default(SubscriberAttribute subscriberAttribute, SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            subscriberAttributeKey = subscriberAttribute.key;
        }
        if ((i10 & 2) != 0) {
            str = subscriberAttribute.value;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            dateProvider = subscriberAttribute.dateProvider;
        }
        DateProvider dateProvider2 = dateProvider;
        if ((i10 & 8) != 0) {
            date = subscriberAttribute.setTime;
        }
        Date date2 = date;
        if ((i10 & 16) != 0) {
            z10 = subscriberAttribute.isSynced;
        }
        return subscriberAttribute.copy(subscriberAttributeKey, str2, dateProvider2, date2, z10);
    }

    public final SubscriberAttributeKey component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final DateProvider component3() {
        return this.dateProvider;
    }

    public final Date component4() {
        return this.setTime;
    }

    public final boolean component5() {
        return this.isSynced;
    }

    public final SubscriberAttribute copy(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, subscriberAttributeKey);
        AbstractC3557B.c0("dateProvider", dateProvider);
        AbstractC3557B.c0("setTime", date);
        return new SubscriberAttribute(subscriberAttributeKey, str, dateProvider, date, z10);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(SubscriberAttribute.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttribute", obj);
        SubscriberAttribute subscriberAttribute = (SubscriberAttribute) obj;
        if (AbstractC3557B.K(this.key, subscriberAttribute.key) && AbstractC3557B.K(this.value, subscriberAttribute.value) && AbstractC3557B.K(this.setTime, subscriberAttribute.setTime) && this.isSynced == subscriberAttribute.isSynced) {
            return true;
        }
        return false;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final SubscriberAttributeKey getKey() {
        return this.key;
    }

    public final Date getSetTime() {
        return this.setTime;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = this.key.hashCode() * 31;
        String str = this.value;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (this.setTime.hashCode() + ((hashCode + i10) * 31)) * 31;
        if (this.isSynced) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return hashCode2 + i11;
    }

    public final boolean isSynced() {
        return this.isSynced;
    }

    public final Map<String, Object> toBackendMap() {
        return AbstractC4268D.a1(new C3959i("value", this.value), new C3959i(SubscriberAttributeKt.BACKEND_NAME_TIMESTAMP, Long.valueOf(this.setTime.getTime())));
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_KEY, this.key.getBackendKey());
        String str = this.value;
        if (str == null || jSONObject.put("value", str) == null) {
            jSONObject.put("value", JSONObject.NULL);
        }
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_SET_TIME, this.setTime.getTime());
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_IS_SYNCED, this.isSynced);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SubscriberAttribute(key=");
        sb2.append(this.key);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", setTime=");
        sb2.append(this.setTime);
        sb2.append(", isSynced=");
        return AbstractC6463a.l(sb2, this.isSynced, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SubscriberAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z10, int i10, g gVar) {
        this(subscriberAttributeKey, str, r3, (i10 & 8) != 0 ? r3.getNow() : date, (i10 & 16) != 0 ? false : z10);
        DateProvider defaultDateProvider = (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SubscriberAttribute(String str, String str2, DateProvider dateProvider, Date date, boolean z10, int i10, g gVar) {
        this(str, str2, r3, (i10 & 8) != 0 ? r3.getNow() : date, (i10 & 16) != 0 ? false : z10);
        DateProvider defaultDateProvider = (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriberAttribute(String str, String str2, DateProvider dateProvider, Date date, boolean z10) {
        this(SpecialSubscriberAttributesKt.getSubscriberAttributeKey(str), str2, (DateProvider) null, date, z10, 4, (g) null);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("dateProvider", dateProvider);
        AbstractC3557B.c0("setTime", date);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SubscriberAttribute(JSONObject jSONObject) {
        this(SpecialSubscriberAttributesKt.getSubscriberAttributeKey(r0), JSONObjectExtensionsKt.getNullableString(jSONObject, "value"), (DateProvider) null, new Date(jSONObject.getLong(SubscriberAttributeKt.JSON_NAME_SET_TIME)), jSONObject.getBoolean(SubscriberAttributeKt.JSON_NAME_IS_SYNCED), 4, (g) null);
        AbstractC3557B.c0("jsonObject", jSONObject);
        String string = jSONObject.getString(SubscriberAttributeKt.JSON_NAME_KEY);
        AbstractC3557B.b0("jsonObject.getString(JSON_NAME_KEY)", string);
    }
}
