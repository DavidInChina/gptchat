package com.revenuecat.purchases.utils;

import android.gov.nist.javax.sip.parser.TokenNames;
import jf.C3959i;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {TokenNames.T, "", "kotlin.jvm.PlatformType", "jsonKey", "Ljf/i;", "invoke", "(Ljava/lang/String;)Ljf/i;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class JSONObjectExtensionsKt$toMap$1 extends o implements k {
    final /* synthetic */ boolean $deep;
    final /* synthetic */ JSONObject $this_toMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONObjectExtensionsKt$toMap$1(boolean z10, JSONObject jSONObject) {
        super(1);
        this.$deep = z10;
        this.$this_toMap = jSONObject;
    }

    public final C3959i invoke(String str) {
        if (this.$deep) {
            Object obj = this.$this_toMap.get(str);
            if (obj instanceof JSONObject) {
                obj = JSONObjectExtensionsKt.toMap((JSONObject) obj, true);
            } else if (obj instanceof JSONArray) {
                obj = JSONArrayExtensionsKt.toList((JSONArray) obj);
            }
            return new C3959i(str, obj);
        }
        return new C3959i(str, this.$this_toMap.get(str));
    }
}
