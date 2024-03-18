package com.revenuecat.purchases.common;

import Bi.c;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.events.PaywallEventRequest;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.q;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.g;
import l8.AbstractC4344b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r9.y;
import wf.AbstractC6216a;
import wf.k;
import wf.n;
import wf.o;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B1\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010T\u001a\u00020E\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010Y\u001a\u00020X\u00a2\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004JK\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u00c3\u0001\u0010#\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00140\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\fj\u0002`\u001f2$\u0010\u000e\u001a \u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00020 j\u0002`\"\u00a2\u0006\u0004\b#\u0010$JK\u0010%\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f\u00a2\u0006\u0004\b%\u0010\u0010JK\u0010)\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\t\u00a2\u0006\u0004\b)\u0010*JI\u0010-\u001a\u00020\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0+2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\t2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f\u00a2\u0006\u0004\b-\u0010.J?\u00102\u001a\u00020\u00022\u0006\u00100\u001a\u00020/2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\fH\u0007\u00a2\u0006\u0004\b2\u00103J5\u00105\u001a\u00020\u00022\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00020\t2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\t\u00a2\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0002\u00a2\u0006\u0004\b7\u0010\u0004J\u001f\u0010;\u001a\u00020!2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b;\u0010<Js\u0010K\u001a\u00020\u0002\"\u0004\b\u0000\u0010=\"\u0004\b\u0001\u0010>* \u0012\u0004\u0012\u00020@\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B0A0?2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020@2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B2\b\b\u0002\u0010J\u001a\u00020IH\u0002\u00a2\u0006\u0004\bK\u0010LJy\u0010N\u001a\u00020\u0002\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010>* \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020B0A0?2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00028\u00002\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020B2\b\b\u0002\u0010J\u001a\u00020IH\u0002\u00a2\u0006\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010SR\u0014\u0010T\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u00aa\u0001\u0010]\u001aB\u0012\u0004\u0012\u00020@\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f0Bj\u0002`[0A0?2F\u0010\\\u001aB\u0012\u0004\u0012\u00020@\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f0Bj\u0002`[0A0?8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u00ea\u0001\u0010e\u001ab\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050+j\u0002`c\u0012N\u0012L\u0012H\u0012F\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\fj\u0002`\u001f\u0012\"\u0012 \u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00020 j\u0002`\"0Bj\u0002`d0A0?2f\u0010\\\u001ab\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050+j\u0002`c\u0012N\u0012L\u0012H\u0012F\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\fj\u0002`\u001f\u0012\"\u0012 \u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00020 j\u0002`\"0Bj\u0002`d0A0?8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\be\u0010^\u001a\u0004\bf\u0010`\"\u0004\bg\u0010bR\u00aa\u0001\u0010i\u001aB\u0012\u0004\u0012\u00020@\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f0Bj\u0002`h0A0?2F\u0010\\\u001aB\u0012\u0004\u0012\u00020@\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f0Bj\u0002`h0A0?8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\bi\u0010^\u001a\u0004\bj\u0010`\"\u0004\bk\u0010bR\u00be\u0001\u0010m\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050+j\u0002`c\u00128\u00126\u00122\u00120\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\t0Bj\u0002`l0A0?2P\u0010\\\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050+j\u0002`c\u00128\u00126\u00122\u00120\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\t0Bj\u0002`l0A0?8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\bm\u0010^\u001a\u0004\bn\u0010`\"\u0004\bo\u0010bR\u00be\u0001\u0010q\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050+j\u0002`c\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f0Bj\u0002`p0A0?2P\u0010\\\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050+j\u0002`c\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f0Bj\u0002`p0A0?8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\bq\u0010^\u001a\u0004\br\u0010`\"\u0004\bs\u0010bR\u00b2\u0001\u0010u\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050+j\u0002`c\u00122\u00120\u0012,\u0012*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000201\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f0Bj\u0002`t0A0?2J\u0010\\\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050+j\u0002`c\u00122\u00120\u0012,\u0012*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000201\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\f0Bj\u0002`t0A0?8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\bu\u0010^\u001a\u0004\bv\u0010`\"\u0004\bw\u0010bR\u009e\u0001\u0010y\u001a<\u0012\u0004\u0012\u00020\u0005\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\t0Bj\u0002`x0A0?2@\u0010\\\u001a<\u0012\u0004\u0012\u00020\u0005\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\t0Bj\u0002`x0A0?8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\by\u0010^\u001a\u0004\bz\u0010`\"\u0004\b{\u0010bR\u0011\u0010\u007f\u001a\u00020|8F\u00a2\u0006\u0006\u001a\u0004\b}\u0010~\u00a8\u0006\u0083\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/Backend;", "", "Ljf/y;", "close", "()V", "", "appUserID", "", "appInBackground", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getCustomerInfo", "(Ljava/lang/String;ZLwf/k;Lwf/n;)V", "purchaseToken", "isRestore", "observerMode", "", "subscriberAttributes", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "storeAppUserID", "marketplace", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallPostReceiptData", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataSuccessCallback;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "postReceiptData", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lcom/revenuecat/purchases/common/ReceiptInfo;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lwf/n;Lwf/o;)V", "getOfferings", "newAppUserID", "onSuccessHandler", "onErrorHandler", "logIn", "(Ljava/lang/String;Ljava/lang/String;Lwf/n;Lwf/k;)V", "", "diagnosticsList", "postDiagnostics", "(Ljava/util/List;Lwf/k;Lwf/n;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;", "paywallEventRequest", "Lkotlin/Function0;", "postPaywallEvents", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;Lwf/a;Lwf/n;)V", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "getProductEntitlementMapping", "(Lwf/k;Lwf/k;)V", "clearCaches", "", "responseCode", "purchasesError", "determinePostReceiptErrorHandlingBehavior", "(ILcom/revenuecat/purchases/PurchasesError;)Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", TokenNames.S, TokenNames.f24311E, "", "Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;", "", "Ljf/i;", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "call", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "cacheKey", "functions", "Lcom/revenuecat/purchases/common/Delay;", "delay", "addBackgroundAwareCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;Ljf/i;Lcom/revenuecat/purchases/common/Delay;)V", TokenNames.f24314K, "addCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Ljava/lang/Object;Ljf/i;Lcom/revenuecat/purchases/common/Delay;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Dispatcher;", "eventsDispatcher", "Lcom/revenuecat/purchases/common/HTTPClient;", "httpClient", "Lcom/revenuecat/purchases/common/HTTPClient;", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "Lcom/revenuecat/purchases/common/BackendHelper;", "Lcom/revenuecat/purchases/common/CustomerInfoCallback;", "<set-?>", "callbacks", "Ljava/util/Map;", "getCallbacks", "()Ljava/util/Map;", "setCallbacks", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/common/CallbackCacheKey;", "Lcom/revenuecat/purchases/common/PostReceiptCallback;", "postReceiptCallbacks", "getPostReceiptCallbacks", "setPostReceiptCallbacks", "Lcom/revenuecat/purchases/common/OfferingsCallback;", "offeringsCallbacks", "getOfferingsCallbacks", "setOfferingsCallbacks", "Lcom/revenuecat/purchases/common/IdentifyCallback;", "identifyCallbacks", "getIdentifyCallbacks", "setIdentifyCallbacks", "Lcom/revenuecat/purchases/common/DiagnosticsCallback;", "diagnosticsCallbacks", "getDiagnosticsCallbacks", "setDiagnosticsCallbacks", "Lcom/revenuecat/purchases/common/PaywallEventsCallback;", "paywallEventsCallbacks", "getPaywallEventsCallbacks", "setPaywallEventsCallbacks", "Lcom/revenuecat/purchases/common/ProductEntitlementCallback;", "productEntitlementCallbacks", "getProductEntitlementCallbacks", "setProductEntitlementCallbacks", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "verificationMode", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/BackendHelper;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class Backend {
    @Deprecated
    public static final String APP_USER_ID = "app_user_id";
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String FETCH_TOKEN = "fetch_token";
    @Deprecated
    public static final String NEW_APP_USER_ID = "new_app_user_id";
    private final AppConfig appConfig;
    private final BackendHelper backendHelper;
    private final Dispatcher dispatcher;
    private final Dispatcher eventsDispatcher;
    private final HTTPClient httpClient;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<C3959i>> callbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<C3959i>> postReceiptCallbacks = new LinkedHashMap();
    private volatile Map<BackgroundAwareCallbackCacheKey, List<C3959i>> offeringsCallbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<C3959i>> identifyCallbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<C3959i>> diagnosticsCallbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<C3959i>> paywallEventsCallbacks = new LinkedHashMap();
    private volatile Map<String, List<C3959i>> productEntitlementCallbacks = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/Backend$Companion;", "", "()V", "APP_USER_ID", "", "FETCH_TOKEN", "NEW_APP_USER_ID", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public Backend(AppConfig appConfig, Dispatcher dispatcher, Dispatcher dispatcher2, HTTPClient hTTPClient, BackendHelper backendHelper) {
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("dispatcher", dispatcher);
        AbstractC3557B.c0("eventsDispatcher", dispatcher2);
        AbstractC3557B.c0("httpClient", hTTPClient);
        AbstractC3557B.c0("backendHelper", backendHelper);
        this.appConfig = appConfig;
        this.dispatcher = dispatcher;
        this.eventsDispatcher = dispatcher2;
        this.httpClient = hTTPClient;
        this.backendHelper = backendHelper;
    }

    private final synchronized <S, E> void addBackgroundAwareCallback(Map<BackgroundAwareCallbackCacheKey, List<C3959i>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, C3959i c3959i, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        List<C3959i> list = null;
        try {
            BackgroundAwareCallbackCacheKey copy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, false, 1, null);
            boolean containsKey = map.containsKey(copy$default);
            if (backgroundAwareCallbackCacheKey.getAppInBackground() && containsKey) {
                LogUtilsKt.debugLog(String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITHOUT_JITTER, Arrays.copyOf(new Object[]{copy$default}, 1)));
                backgroundAwareCallbackCacheKey2 = copy$default;
            } else {
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
            }
            addCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey2, c3959i, delay);
            BackgroundAwareCallbackCacheKey copy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, true, 1, null);
            boolean containsKey2 = map.containsKey(copy$default);
            if (!backgroundAwareCallbackCacheKey.getAppInBackground() && containsKey2) {
                LogUtilsKt.debugLog(String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITH_JITTER, Arrays.copyOf(new Object[]{copy$default}, 1)));
                List<C3959i> remove = map.remove(copy$default2);
                if (remove != null) {
                    if (!remove.isEmpty()) {
                        list = remove;
                    }
                    if (list != null) {
                        if (map.containsKey(backgroundAwareCallbackCacheKey)) {
                            List<C3959i> list2 = map.get(backgroundAwareCallbackCacheKey);
                            if (list2 != null) {
                                list2.addAll(list);
                            }
                        } else {
                            map.put(backgroundAwareCallbackCacheKey, list);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, C3959i c3959i, Delay delay, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey, c3959i, delay);
    }

    private final <K, S, E> void addCallback(Map<K, List<C3959i>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, K k10, C3959i c3959i, Delay delay) {
        if (!map.containsKey(k10)) {
            map.put(k10, AbstractC4344b.N0(c3959i));
            this.backendHelper.enqueue(asyncCall, dispatcher, delay);
            return;
        }
        LogUtilsKt.debugLog(String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k10}, 1)));
        List<C3959i> list = map.get(k10);
        AbstractC3557B.Z(list);
        list.add(c3959i);
    }

    public static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, C3959i c3959i, Delay delay, int i10, Object obj2) {
        if ((i10 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher, obj, c3959i, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int i10, PurchasesError purchasesError) {
        if (RCHTTPStatusCodes.INSTANCE.isServerError(i10)) {
            return PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME;
        }
        if (purchasesError.getCode() == PurchasesErrorCode.UnsupportedError) {
            return PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME;
        }
        return PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED;
    }

    public static /* synthetic */ void postReceiptData$default(Backend backend, String str, String str2, boolean z10, boolean z11, Map map, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, n nVar, o oVar, int i10, Object obj) {
        String str5;
        if ((i10 & 128) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        backend.postReceiptData(str, str2, z10, z11, map, receiptInfo, str3, str5, postReceiptInitiationSource, paywallPostReceiptData, nVar, oVar);
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<C3959i>> getCallbacks() {
        return this.callbacks;
    }

    public final void getCustomerInfo(String str, boolean z10, k kVar, n nVar) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        Delay delay;
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", nVar);
        final Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(str);
        String path = getCustomerInfo.getPath();
        synchronized (this) {
            try {
                if (this.postReceiptCallbacks.isEmpty()) {
                    backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(AbstractC4344b.F0(path), z10);
                } else {
                    backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(t.x2(String.valueOf(this.callbacks.size()), AbstractC4344b.F0(path)), z10);
                }
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getCustomerInfo$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                HTTPClient hTTPClient;
                AppConfig appConfig;
                BackendHelper backendHelper;
                hTTPClient = Backend.this.httpClient;
                appConfig = Backend.this.appConfig;
                URL baseURL = appConfig.getBaseURL();
                Endpoint.GetCustomerInfo getCustomerInfo2 = getCustomerInfo;
                backendHelper = Backend.this.backendHelper;
                return HTTPClient.performRequest$default(hTTPClient, baseURL, getCustomerInfo2, null, null, backendHelper.getAuthenticationHeaders$purchases_customEntitlementComputationRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<C3959i> remove;
                AbstractC3557B.c0("result", hTTPResult);
                Backend backend = Backend.this;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey2;
                synchronized (backend) {
                    remove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey3);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        k kVar2 = (k) c3959i.f36155Y;
                        n nVar2 = (n) c3959i.f36156Z;
                        try {
                            if (BackendHelperKt.isSuccessful(hTTPResult)) {
                                kVar2.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                                LogUtilsKt.errorLog(purchasesError);
                                nVar2.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode())));
                            }
                        } catch (JSONException e10) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e10);
                            LogUtilsKt.errorLog(purchasesError2);
                            nVar2.invoke(purchasesError2, Boolean.FALSE);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<C3959i> remove;
                AbstractC3557B.c0("error", purchasesError);
                Backend backend = Backend.this;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey2;
                synchronized (backend) {
                    remove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey3);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        ((n) c3959i.f36156Z).invoke(purchasesError, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                if (z10) {
                    delay = Delay.DEFAULT;
                } else {
                    delay = Delay.NONE;
                }
                addBackgroundAwareCallback(this.callbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey2, new C3959i(kVar, nVar), delay);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized Map<List<String>, List<C3959i>> getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map<List<String>, List<C3959i>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String str, boolean z10, k kVar, n nVar) {
        Delay delay;
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", nVar);
        final Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(str);
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(AbstractC4344b.F0(getOfferings.getPath()), z10);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getOfferings$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                HTTPClient hTTPClient;
                AppConfig appConfig;
                BackendHelper backendHelper;
                hTTPClient = Backend.this.httpClient;
                appConfig = Backend.this.appConfig;
                URL baseURL = appConfig.getBaseURL();
                Endpoint.GetOfferings getOfferings2 = getOfferings;
                backendHelper = Backend.this.backendHelper;
                return HTTPClient.performRequest$default(hTTPClient, baseURL, getOfferings2, null, null, backendHelper.getAuthenticationHeaders$purchases_customEntitlementComputationRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<C3959i> remove;
                AbstractC3557B.c0("result", hTTPResult);
                Backend backend = Backend.this;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    remove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        k kVar2 = (k) c3959i.f36155Y;
                        n nVar2 = (n) c3959i.f36156Z;
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            try {
                                kVar2.invoke(hTTPResult.getBody());
                            } catch (JSONException e10) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e10);
                                LogUtilsKt.errorLog(purchasesError);
                                nVar2.invoke(purchasesError, Boolean.FALSE);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(hTTPResult);
                            LogUtilsKt.errorLog(purchasesError2);
                            nVar2.invoke(purchasesError2, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode())));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<C3959i> remove;
                AbstractC3557B.c0("error", purchasesError);
                Backend backend = Backend.this;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    remove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        ((n) c3959i.f36156Z).invoke(purchasesError, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                if (z10) {
                    delay = Delay.DEFAULT;
                } else {
                    delay = Delay.NONE;
                }
                addBackgroundAwareCallback(this.offeringsCallbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, new C3959i(kVar, nVar), delay);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<C3959i>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<C3959i>> getPaywallEventsCallbacks() {
        return this.paywallEventsCallbacks;
    }

    public final synchronized Map<List<String>, List<C3959i>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map<String, List<C3959i>> getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(k kVar, k kVar2) {
        AbstractC3557B.c0("onSuccessHandler", kVar);
        AbstractC3557B.c0("onErrorHandler", kVar2);
        final Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        final String path = getProductEntitlementMapping.getPath();
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getProductEntitlementMapping$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                HTTPClient hTTPClient;
                AppConfig appConfig;
                BackendHelper backendHelper;
                hTTPClient = Backend.this.httpClient;
                appConfig = Backend.this.appConfig;
                URL baseURL = appConfig.getBaseURL();
                Endpoint.GetProductEntitlementMapping getProductEntitlementMapping2 = getProductEntitlementMapping;
                backendHelper = Backend.this.backendHelper;
                return HTTPClient.performRequest$default(hTTPClient, baseURL, getProductEntitlementMapping2, null, null, backendHelper.getAuthenticationHeaders$purchases_customEntitlementComputationRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<C3959i> remove;
                AbstractC3557B.c0("result", hTTPResult);
                Backend backend = Backend.this;
                String str = path;
                synchronized (backend) {
                    remove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        k kVar3 = (k) c3959i.f36155Y;
                        k kVar4 = (k) c3959i.f36156Z;
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            try {
                                kVar3.invoke(ProductEntitlementMapping.Companion.fromJson(hTTPResult.getBody()));
                            } catch (JSONException e10) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e10);
                                LogUtilsKt.errorLog(purchasesError);
                                kVar4.invoke(purchasesError);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(hTTPResult);
                            LogUtilsKt.errorLog(purchasesError2);
                            kVar4.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<C3959i> remove;
                AbstractC3557B.c0("error", purchasesError);
                Backend backend = Backend.this;
                String str = path;
                synchronized (backend) {
                    remove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        ((k) c3959i.f36156Z).invoke(purchasesError);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.productEntitlementCallbacks, asyncCall, this.dispatcher, path, new C3959i(kVar, kVar2), Delay.LONG);
        }
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void logIn(final String str, final String str2, n nVar, k kVar) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("newAppUserID", str2);
        AbstractC3557B.c0("onSuccessHandler", nVar);
        AbstractC3557B.c0("onErrorHandler", kVar);
        final ArrayList h32 = q.h3(new String[]{str, str2});
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$logIn$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                HTTPClient hTTPClient;
                AppConfig appConfig;
                BackendHelper backendHelper;
                Map a12 = AbstractC4268D.a1(new C3959i(Backend.APP_USER_ID, str), new C3959i(Backend.NEW_APP_USER_ID, str2));
                List G02 = AbstractC4344b.G0(new C3959i(Backend.APP_USER_ID, str), new C3959i(Backend.NEW_APP_USER_ID, str2));
                hTTPClient = this.httpClient;
                appConfig = this.appConfig;
                URL baseURL = appConfig.getBaseURL();
                Endpoint.LogIn logIn = Endpoint.LogIn.INSTANCE;
                backendHelper = this.backendHelper;
                return HTTPClient.performRequest$default(hTTPClient, baseURL, logIn, a12, G02, backendHelper.getAuthenticationHeaders$purchases_customEntitlementComputationRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<C3959i> remove;
                boolean z10;
                AbstractC3557B.c0("result", hTTPResult);
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    Backend backend = this;
                    List<String> list = h32;
                    synchronized (backend) {
                        remove = backend.getIdentifyCallbacks().remove(list);
                    }
                    if (remove != null) {
                        for (C3959i c3959i : remove) {
                            n nVar2 = (n) c3959i.f36155Y;
                            k kVar2 = (k) c3959i.f36156Z;
                            if (hTTPResult.getResponseCode() == 201) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (hTTPResult.getBody().length() > 0) {
                                nVar2.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult), Boolean.valueOf(z10));
                            } else {
                                PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                                LogUtilsKt.errorLog(purchasesError);
                                kVar2.invoke(purchasesError);
                            }
                        }
                        return;
                    }
                    return;
                }
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(hTTPResult);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<C3959i> remove;
                AbstractC3557B.c0("error", purchasesError);
                Backend backend = this;
                List<String> list = h32;
                synchronized (backend) {
                    remove = backend.getIdentifyCallbacks().remove(list);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        ((k) c3959i.f36156Z).invoke(purchasesError);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.identifyCallbacks, asyncCall, this.dispatcher, h32, new C3959i(nVar, kVar), null, 16, null);
        }
    }

    public final void postDiagnostics(List<? extends JSONObject> list, k kVar, n nVar) {
        AbstractC3557B.c0("diagnosticsList", list);
        AbstractC3557B.c0("onSuccessHandler", kVar);
        AbstractC3557B.c0("onErrorHandler", nVar);
        final ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (JSONObject jSONObject : list) {
            arrayList.add(String.valueOf(jSONObject.hashCode()));
        }
        final Map o02 = P4.a.o0(new C3959i("entries", new JSONArray((Collection) list)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postDiagnostics$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                HTTPClient hTTPClient;
                BackendHelper backendHelper;
                hTTPClient = Backend.this.httpClient;
                URL diagnosticsURL = AppConfig.Companion.getDiagnosticsURL();
                Endpoint.PostDiagnostics postDiagnostics = Endpoint.PostDiagnostics.INSTANCE;
                Map<String, JSONArray> map = o02;
                backendHelper = Backend.this.backendHelper;
                return HTTPClient.performRequest$default(hTTPClient, diagnosticsURL, postDiagnostics, map, null, backendHelper.getAuthenticationHeaders$purchases_customEntitlementComputationRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<C3959i> remove;
                boolean z10;
                AbstractC3557B.c0("result", hTTPResult);
                Backend backend = Backend.this;
                List<String> list2 = arrayList;
                synchronized (backend) {
                    remove = backend.getDiagnosticsCallbacks().remove(list2);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        k kVar2 = (k) c3959i.f36155Y;
                        n nVar2 = (n) c3959i.f36156Z;
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            kVar2.invoke(hTTPResult.getBody());
                        } else {
                            PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                            if (!RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode()) && purchasesError.getCode() != PurchasesErrorCode.NetworkError) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            nVar2.invoke(purchasesError, Boolean.valueOf(z10));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<C3959i> remove;
                boolean z10;
                AbstractC3557B.c0("error", purchasesError);
                Backend backend = Backend.this;
                List<String> list2 = arrayList;
                synchronized (backend) {
                    remove = backend.getDiagnosticsCallbacks().remove(list2);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        n nVar2 = (n) c3959i.f36156Z;
                        if (purchasesError.getCode() == PurchasesErrorCode.NetworkError) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        nVar2.invoke(purchasesError, Boolean.valueOf(z10));
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.diagnosticsCallbacks, asyncCall, this.eventsDispatcher, arrayList, new C3959i(kVar, nVar), Delay.LONG);
        }
    }

    public final void postPaywallEvents(final PaywallEventRequest paywallEventRequest, AbstractC6216a abstractC6216a, n nVar) {
        AbstractC3557B.c0("paywallEventRequest", paywallEventRequest);
        AbstractC3557B.c0("onSuccessHandler", abstractC6216a);
        AbstractC3557B.c0("onErrorHandler", nVar);
        AbstractC2904d json = PaywallEventRequest.Companion.getJson();
        final Map<String, Object> asMap = JsonElementExtensionsKt.asMap(json.c(c.F1(json.f29417b, C.a(PaywallEventRequest.class)), paywallEventRequest));
        if (asMap == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Error encoding paywall event request");
            LogUtilsKt.errorLog(purchasesError);
            nVar.invoke(purchasesError, Boolean.TRUE);
            return;
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postPaywallEvents$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                HTTPClient hTTPClient;
                BackendHelper backendHelper;
                hTTPClient = Backend.this.httpClient;
                URL paywallEventsURL = AppConfig.Companion.getPaywallEventsURL();
                Endpoint.PostPaywallEvents postPaywallEvents = Endpoint.PostPaywallEvents.INSTANCE;
                Map<String, Object> map = asMap;
                backendHelper = Backend.this.backendHelper;
                return HTTPClient.performRequest$default(hTTPClient, paywallEventsURL, postPaywallEvents, map, null, backendHelper.getAuthenticationHeaders$purchases_customEntitlementComputationRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<C3959i> remove;
                AbstractC3557B.c0("result", hTTPResult);
                Backend backend = Backend.this;
                PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                synchronized (backend) {
                    remove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        AbstractC6216a abstractC6216a2 = (AbstractC6216a) c3959i.f36155Y;
                        n nVar2 = (n) c3959i.f36156Z;
                        if (BackendHelperKt.isSuccessful(hTTPResult)) {
                            abstractC6216a2.mo122invoke();
                        } else {
                            nVar2.invoke(ErrorsKt.toPurchasesError(hTTPResult), Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isSynced(hTTPResult.getResponseCode())));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError2) {
                List<C3959i> remove;
                AbstractC3557B.c0("error", purchasesError2);
                Backend backend = Backend.this;
                PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                synchronized (backend) {
                    remove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        ((n) c3959i.f36156Z).invoke(purchasesError2, Boolean.TRUE);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.paywallEventsCallbacks, asyncCall, this.eventsDispatcher, paywallEventRequest.getCacheKey(), new C3959i(abstractC6216a, nVar), Delay.LONG);
        }
    }

    public final void postReceiptData(String str, String str2, boolean z10, boolean z11, Map<String, ? extends Map<String, ? extends Object>> map, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, n nVar, o oVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Price price;
        GoogleProrationMode asGoogleProrationMode$purchases_customEntitlementComputationRelease;
        PresentedOfferingContext.TargetingContext targetingContext;
        AbstractC3557B.c0("purchaseToken", str);
        AbstractC3557B.c0("appUserID", str2);
        Map<String, ? extends Map<String, ? extends Object>> map2 = map;
        AbstractC3557B.c0("subscriberAttributes", map2);
        AbstractC3557B.c0("receiptInfo", receiptInfo);
        AbstractC3557B.c0("initiationSource", postReceiptInitiationSource);
        AbstractC3557B.c0("onSuccess", nVar);
        AbstractC3557B.c0("onError", oVar);
        final ArrayList h32 = q.h3(new String[]{str, str2, String.valueOf(z10), String.valueOf(z11), map.toString(), receiptInfo.toString(), str3});
        C3959i[] c3959iArr = new C3959i[18];
        c3959iArr[0] = new C3959i(FETCH_TOKEN, str);
        c3959iArr[1] = new C3959i("product_ids", receiptInfo.getProductIDs());
        List<PlatformProductId> platformProductIds$purchases_customEntitlementComputationRelease = receiptInfo.getPlatformProductIds$purchases_customEntitlementComputationRelease();
        if (platformProductIds$purchases_customEntitlementComputationRelease != null) {
            arrayList = new ArrayList(AbstractC6583a.H1(platformProductIds$purchases_customEntitlementComputationRelease, 10));
            for (PlatformProductId platformProductId : platformProductIds$purchases_customEntitlementComputationRelease) {
                arrayList.add(platformProductId.getAsMap());
            }
        } else {
            arrayList = null;
        }
        c3959iArr[2] = new C3959i("platform_product_ids", arrayList);
        c3959iArr[3] = new C3959i(APP_USER_ID, str2);
        c3959iArr[4] = new C3959i("is_restore", Boolean.valueOf(z10));
        PresentedOfferingContext presentedOfferingContext = receiptInfo.getPresentedOfferingContext();
        c3959iArr[5] = new C3959i("presented_offering_identifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = receiptInfo.getPresentedOfferingContext();
        c3959iArr[6] = new C3959i("presented_placement_identifier", presentedOfferingContext2 != null ? presentedOfferingContext2.getPlacementIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext3 = receiptInfo.getPresentedOfferingContext();
        c3959iArr[7] = new C3959i("applied_targeting_rule", (presentedOfferingContext3 == null || (targetingContext = presentedOfferingContext3.getTargetingContext()) == null) ? null : AbstractC4268D.a1(new C3959i("revision", Integer.valueOf(targetingContext.getRevision())), new C3959i("rule_id", targetingContext.getRuleId())));
        c3959iArr[8] = new C3959i("observer_mode", Boolean.valueOf(z11));
        c3959iArr[9] = new C3959i("price", receiptInfo.getPrice());
        c3959iArr[10] = new C3959i("currency", receiptInfo.getCurrency());
        if (map.isEmpty() || this.appConfig.getCustomEntitlementComputation()) {
            map2 = null;
        }
        c3959iArr[11] = new C3959i("attributes", map2);
        c3959iArr[12] = new C3959i("normal_duration", receiptInfo.getDuration());
        c3959iArr[13] = new C3959i("store_user_id", str3);
        List<PricingPhase> pricingPhases = receiptInfo.getPricingPhases();
        if (pricingPhases != null) {
            arrayList2 = new ArrayList(AbstractC6583a.H1(pricingPhases, 10));
            for (PricingPhase pricingPhase : pricingPhases) {
                arrayList2.add(BackendKt.toMap(pricingPhase));
            }
        } else {
            arrayList2 = null;
        }
        c3959iArr[14] = new C3959i("pricing_phases", arrayList2);
        ReplacementMode replacementMode = receiptInfo.getReplacementMode();
        GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
        c3959iArr[15] = new C3959i("proration_mode", (googleReplacementMode == null || (asGoogleProrationMode$purchases_customEntitlementComputationRelease = googleReplacementMode.getAsGoogleProrationMode$purchases_customEntitlementComputationRelease()) == null) ? null : asGoogleProrationMode$purchases_customEntitlementComputationRelease.name());
        c3959iArr[16] = new C3959i("initiation_source", postReceiptInitiationSource.getPostReceiptFieldValue());
        c3959iArr[17] = new C3959i("paywall", paywallPostReceiptData != null ? paywallPostReceiptData.toMap() : null);
        final Map filterNotNullValues = MapExtensionsKt.filterNotNullValues(AbstractC4268D.a1(c3959iArr));
        final List G02 = AbstractC4344b.G0(new C3959i(APP_USER_ID, str2), new C3959i(FETCH_TOKEN, str));
        C3959i[] c3959iArr2 = new C3959i[2];
        StoreProduct storeProduct = receiptInfo.getStoreProduct();
        c3959iArr2[0] = new C3959i("price_string", (storeProduct == null || (price = storeProduct.getPrice()) == null) ? null : price.getFormatted());
        c3959iArr2[1] = new C3959i("marketplace", str4);
        final Map filterNotNullValues2 = MapExtensionsKt.filterNotNullValues(AbstractC4268D.a1(c3959iArr2));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postReceiptData$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                HTTPClient hTTPClient;
                AppConfig appConfig;
                BackendHelper backendHelper;
                hTTPClient = Backend.this.httpClient;
                appConfig = Backend.this.appConfig;
                URL baseURL = appConfig.getBaseURL();
                Endpoint.PostReceipt postReceipt = Endpoint.PostReceipt.INSTANCE;
                Map<String, Object> map3 = filterNotNullValues;
                List<C3959i> list = G02;
                backendHelper = Backend.this.backendHelper;
                return HTTPClient.performRequest$default(hTTPClient, baseURL, postReceipt, map3, list, AbstractC4268D.e1(backendHelper.getAuthenticationHeaders$purchases_customEntitlementComputationRelease(), filterNotNullValues2), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<C3959i> remove;
                PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior;
                AbstractC3557B.c0("result", hTTPResult);
                Backend backend = Backend.this;
                List<String> list = h32;
                synchronized (backend) {
                    remove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (remove != null) {
                    Backend backend2 = Backend.this;
                    for (C3959i c3959i : remove) {
                        n nVar2 = (n) c3959i.f36155Y;
                        o oVar2 = (o) c3959i.f36156Z;
                        try {
                            if (BackendHelperKt.isSuccessful(hTTPResult)) {
                                nVar2.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult), hTTPResult.getBody());
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                                LogUtilsKt.errorLog(purchasesError);
                                determinePostReceiptErrorHandlingBehavior = backend2.determinePostReceiptErrorHandlingBehavior(hTTPResult.getResponseCode(), purchasesError);
                                oVar2.invoke(purchasesError, determinePostReceiptErrorHandlingBehavior, hTTPResult.getBody());
                            }
                        } catch (JSONException e10) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e10);
                            LogUtilsKt.errorLog(purchasesError2);
                            oVar2.invoke(purchasesError2, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<C3959i> remove;
                AbstractC3557B.c0("error", purchasesError);
                Backend backend = Backend.this;
                List<String> list = h32;
                synchronized (backend) {
                    remove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (remove != null) {
                    for (C3959i c3959i : remove) {
                        ((o) c3959i.f36156Z).invoke(purchasesError, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, asyncCall, this.dispatcher, h32, new C3959i(nVar, oVar), null, 16, null);
        }
    }

    public final synchronized void setCallbacks(Map<BackgroundAwareCallbackCacheKey, List<C3959i>> map) {
        AbstractC3557B.c0("<set-?>", map);
        this.callbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map<List<String>, List<C3959i>> map) {
        AbstractC3557B.c0("<set-?>", map);
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<C3959i>> map) {
        AbstractC3557B.c0("<set-?>", map);
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<BackgroundAwareCallbackCacheKey, List<C3959i>> map) {
        AbstractC3557B.c0("<set-?>", map);
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPaywallEventsCallbacks(Map<List<String>, List<C3959i>> map) {
        AbstractC3557B.c0("<set-?>", map);
        this.paywallEventsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<C3959i>> map) {
        AbstractC3557B.c0("<set-?>", map);
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map<String, List<C3959i>> map) {
        AbstractC3557B.c0("<set-?>", map);
        this.productEntitlementCallbacks = map;
    }
}
