package com.revenuecat.purchases.models;

import Lg.g;
import com.revenuecat.purchases.models.Period;
import id.AbstractC3557B;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jf.C3959i;
import kf.C4270F;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"", "Ljf/i;", "", "Lcom/revenuecat/purchases/models/Period$Unit;", "toPeriod", "(Ljava/lang/String;)Ljf/i;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PeriodKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3959i toPeriod(String str) {
        g gVar;
        Pattern compile = Pattern.compile("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$");
        AbstractC3557B.b0("compile(...)", compile);
        AbstractC3557B.c0("input", str);
        Matcher matcher = compile.matcher(str);
        AbstractC3557B.b0("matcher(...)", matcher);
        if (!matcher.matches()) {
            gVar = null;
        } else {
            gVar = new g(matcher, str);
        }
        if (gVar != null) {
            PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
            int intValue = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) ((String) ((C4270F) gVar.a()).get(1)))).intValue();
            int intValue2 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) ((String) ((C4270F) gVar.a()).get(2)))).intValue();
            int intValue3 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) ((String) ((C4270F) gVar.a()).get(3)))).intValue();
            int intValue4 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) ((String) ((C4270F) gVar.a()).get(4)))).intValue();
            if (intValue > 0) {
                return new C3959i(Integer.valueOf(intValue), Period.Unit.YEAR);
            }
            if (intValue2 > 0) {
                return new C3959i(Integer.valueOf(intValue2), Period.Unit.MONTH);
            }
            if (intValue3 > 0) {
                return new C3959i(Integer.valueOf(intValue3), Period.Unit.WEEK);
            }
            if (intValue4 > 0) {
                return new C3959i(Integer.valueOf(intValue4), Period.Unit.DAY);
            }
            return new C3959i(0, Period.Unit.UNKNOWN);
        }
        return new C3959i(0, Period.Unit.UNKNOWN);
    }
}
